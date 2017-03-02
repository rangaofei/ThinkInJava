package twenty;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by saka on 2017/3/2.
 */
public class TableCreator {
    private static String[] arg;
    public static void main(String[] args) throws ClassNotFoundException {
        if (args.length < 1) {
            System.out.println("arguments: annotated classes");
            arg= new String[]{"twenty.Member", "twenty.Member"};
        }

        for (String classname : arg) {
            Class<?> cl = Class.forName(classname);
            DBTable dbTable = cl.getAnnotation(DBTable.class);
            if (dbTable == null) {
                System.out.println("No DBTable annontations in class " + classname);
                continue;
            }
            String tableName = dbTable.name();
            if (tableName.length() < 1) {
                tableName = cl.getName().toUpperCase();
            }
            List<String> columnDefs = new ArrayList<>();
            for (Field field : cl.getDeclaredFields()) {
                String columnName = null;
                Annotation[] anns = field.getDeclaredAnnotations();
                if (anns.length < 1) {
                    continue;
                }
                if (anns[0] instanceof SQLInteger) {
                    SQLInteger sInt = (SQLInteger) anns[0];
                    if (sInt.name().length() < 1) {
                        columnName = field.getName().toUpperCase();
                    } else {
                        columnName = sInt.name();
                    }
                    columnDefs.add(columnName + " INT " + getConstraints(sInt.constraints()));
                }
                if (anns[0] instanceof SQLString) {
                    SQLString sString = (SQLString) anns[0];
                    if (sString.name().length() < 0) {
                        columnName = field.getName().toUpperCase();
                    } else {
                        columnName = sString.name();
                    }
                    columnDefs.add(columnName + " VARCHAR(" + sString.value() + ")");
                    getConstraints(sString.constraints());
                }
                StringBuilder createCommand = new StringBuilder("CREATE TABLE " + tableName + "(");
                for (String columnDef : columnDefs) {
                    createCommand.append("\n  " + columnDef + ",");
                }
                String tableCreate = createCommand.substring(0, createCommand.length() - 1) + ")";
                System.out.println("Table Creation SQL for " + classname + " is :\n" + tableCreate);
            }
        }


    }

    private static String getConstraints(Constaraints con) {
        String constraints = "";
        if (!con.allowNull()) {
            constraints += " NOT NULL";
        }
        if (con.primaryKey()) {
            constraints += " PRIMARY KEY";
        }
        if (con.unique()) {
            constraints += " UNIQUE";
        }
        return constraints;

    }
}
