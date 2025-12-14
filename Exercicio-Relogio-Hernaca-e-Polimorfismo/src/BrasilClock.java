public non-sealed class BrasilClock extends Clock{

    @Override
   public Clock convert(Clock clock) {
        this.minute = clock.getMinute();
        this.second = clock.getSecond();

        switch (clock){
            case AmericanClock americanClock -> this.hour = (americanClock.getPeriodIndicator().equals("PM")) ?
                    americanClock.getHour() + 12: americanClock.getHour();
            case BrasilClock brasilClock -> this.hour = brasilClock.getHour();
        }
        return this;
    }
}
