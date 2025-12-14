public non-sealed class AmericanClock extends Clock{
    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }
    public void setBeforeMidday(){
        this.periodIndicator = "AM";
    }
    public void setAffterMidday(){
        this.periodIndicator = "PM";
    }

    public void setHour(int hour){
        //this.periodIndicator = "AM";
        setBeforeMidday();
        if((hour>12) && (hour<=23)){
            //this.periodIndicator = "PM";
            setAffterMidday();
            this.hour = hour - 12;
        } else if (hour >= 24) {
            this.hour = 0;
        }else {
            this.hour = hour;
        }

    }
    @Override
   public Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock){
            case AmericanClock americanClock -> {
                this.hour = americanClock.getHour();
                this.periodIndicator = americanClock.getPeriodIndicator();
            }
            case BrasilClock basilClock -> this.setHour(basilClock.getHour());
        }
        return this;
    }
    @Override 
    public String getTime(){
        return super.getTime() + " " + this.periodIndicator;
    }
}
