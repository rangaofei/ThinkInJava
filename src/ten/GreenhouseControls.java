package ten;

/**
 * Created by Administrator on 2017/2/14 0014.
 */
public class GreenhouseControls extends Controller {
    private boolean light=false;

    public class LightOn extends Event{

        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light=true;
        }

        public String toString(){
            return "light is on";
        }
    }

    public class LightOff extends Event{

        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light=false;
        }

        public String toString(){
            return "light is off";
        }
    }

    private boolean water=false;

    public class WaterOn extends Event{

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water=true;
        }

        public String toString(){
            return "Greenhouse water is on";
        }
    }

    public class WaterOff extends Event{

        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water=false;
        }

        public String toString(){
            return "Greenhouse water is off";
        }
    }

    private String thermostat="Day";
    public class ThermostatNight extends Event{

        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat="Night";
        }

        public String toString(){
            return "Thermostat on night setting";
        }
    }

    public class ThermostatDay extends Event{

        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat="Day";
        }

        public String toString(){
            return "Thermostat on day setting";
        }
    }

    public class Bell extends Event{

        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString(){
            return "Bing!";
        }
    }

    public class Restart extends Event{

        private Event[] eventlist;

        public Restart(long delayTime,Event[] eventlist) {
            super(delayTime);
            this.eventlist=eventlist;
            for(Event e:eventlist){
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for(Event e:eventlist){
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        public String toString(){
            return "Restarting sysytem";
        }
    }

    public static class Terminate extends Event{

        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        public String toString(){
            return "Terminating";
        }
    }
}
