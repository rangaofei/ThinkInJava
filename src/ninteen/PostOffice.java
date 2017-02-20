package ninteen;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/2/20 0020.
 */

class Mail {
    enum GeneralDelivery {YES, NO1, NO2, NO3, NO4, NO5}

    enum Scannability {UNSCANNABLE, YES1, YES2, YES3, YES4}

    enum Readaility {ILLEGIBLE, YES1, YES2, YES3, YES4}

    enum Adress {INCORRECT, OK1, OK2, OK3, OK4, OK5, OK6}

    enum ReturnAddress {MISSING, OK1, OK2, OK3, OK4, OK5}

    GeneralDelivery generalDelivery;
    Scannability scannability;
    Readaility readaility;
    Adress adress;
    ReturnAddress returnAddress;

    static long counter = 0;
    long id = counter++;

    public String toString() {
        return "Mail " + id;
    }

    public String deatils() {
        return toString() + ",General Delivery: " + generalDelivery +
                ",Address Scanability: " + scannability +
                ",Address Readability: " + readaility +
                ",Address Address: " + adress +
                ",Return address: " + returnAddress;
    }

    public static Mail randomMail() {
        Mail m = new Mail();
        m.generalDelivery = Enums.random(GeneralDelivery.class);
        m.scannability = Enums.random(Scannability.class);
        m.readaility = Enums.random(Readaility.class);
        m.adress = Enums.random(Adress.class);
        m.returnAddress = Enums.random(ReturnAddress.class);
        return m;
    }

    public static Iterable<Mail> generator(final int count) {
        return new Iterable<Mail>() {
            int n = count;

            @Override
            public Iterator<Mail> iterator() {
                return new Iterator<Mail>() {

                    @Override
                    public boolean hasNext() {
                        return n-- > 0;
                    }

                    @Override
                    public Mail next() {
                        return randomMail();
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

}

public class PostOffice {
    enum MailHandler {
        GENERAL_DELIVERY {
            @Override
            boolean handle(Mail m) {
                switch (m.generalDelivery) {
                    case YES:
                        System.out.println("Using general delivery for " + m);
                        return true;
                    default:
                        return false;
                }
            }
        },
        MACHINE_SACN {
            @Override
            boolean handle(Mail m) {
                switch (m.scannability) {
                    case UNSCANNABLE:
                        return false;
                    default:
                        switch (m.adress) {
                            case INCORRECT:
                                return false;
                            default:
                                System.out.println("Delivering " + m + " automatically");
                                return true;
                        }
                }
            }
        },

        VISUAL_INSPECTION {
            @Override
            boolean handle(Mail m) {
                switch (m.readaility) {
                    case ILLEGIBLE:
                        return false;
                    default:
                        switch (m.adress) {
                            case INCORRECT:
                                return false;
                            default:
                                System.out.println("Delivering " + m + " automatically");
                                return true;
                        }
                }
            }
        },
        RETURN_TO_SENDER {
            @Override
            boolean handle(Mail m) {
                switch (m.returnAddress) {
                    case MISSING:
                        return false;
                    default:
                        System.out.println("Returning " + m + " to sender");
                        return true;

                }
            }
        };

        abstract boolean handle(Mail m);
        }

    static void handle(Mail m) {
        for (MailHandler handler : MailHandler.values()) {
            if (handler.handle(m)) {
                return;
            }
        }
        System.out.println(m + " is a dead letter.");
    }

    public static void main(String[] args) {
        for(Mail mail:Mail.generator(10)){
            System.out.println(mail.deatils());
            handle(mail);
            System.out.println("******");
        }
    }

}
