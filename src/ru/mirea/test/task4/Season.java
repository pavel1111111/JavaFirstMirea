package ru.mirea.test.task4;

public enum Season {
    WINTER(-3), SPRING(15), SUMMER(27){
        @Override
        public String getDescription(){
            return "теплое время года";
        }
    }, AUTUMN(8);

    private double avgTemp;
    Season(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public double getAvgTemp(){
        return avgTemp;
    }

    public String getDescription(){
        return "холодное время года";
    }
}
