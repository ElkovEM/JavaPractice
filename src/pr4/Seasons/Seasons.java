package pr4.Seasons;

public enum Seasons {
        SUMMER(18) {
            public String getDescription() {
                return "Warm season.";
            }
        },
        AUTUMN(3.7), WINTER(-10), SPRING(4.3);
        private double avgTemp;
        Seasons(double temp) {
            this.avgTemp = temp;
        }
        public double getAvgTemp() {
            return this.avgTemp;
        }
        public String getDescription() {
            return "Cold season.";
        }
};
