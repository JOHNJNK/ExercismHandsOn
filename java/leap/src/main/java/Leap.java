class Leap {

    boolean isLeapYear(int year) {
        return (year%400==0 || (year%100!=0 && year%4==0)) ? true : false;
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
