package homework.lesson9;

public class Park {

    public String name;
    public Attraction attraction;

    public Park(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "name='" + attraction.getAttractionName() + '\'' +
                ", workingHours='" + attraction.getWorkTime() + '\'' +
                ", ticketPrice=" + attraction.getCost() +
                '}';
    }

       class Attraction {

        private String attractionName;
        private String workTime;
        private int cost;

        public Attraction(String attractionName, String workTime, int cost) {
            this.attractionName = attractionName;
            this.workTime = workTime;
            this.cost = cost;
        }

        public String getAttractionName() {
            return attractionName;
        }

        public String getWorkTime() {
            return workTime;
        }

        public int getCost() {
            return cost;
        }

        public void setAttractionName(String attractionName) {
            this.attractionName = attractionName;
        }

        public void setWorkTime(String workTime) {
            this.workTime = workTime;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + attraction.getAttractionName() + '\'' +
                    ", workingHours='" + attraction.getWorkTime() + '\'' +
                    ", ticketPrice=" + attraction.getCost() +
                    '}';
        }
    }
}
