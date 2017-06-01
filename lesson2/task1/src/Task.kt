data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    operator override fun compareTo(other: MyDate): Int {

        val yearCompare = this.year.compareTo(other.year)
        val monthCompare = this.month.compareTo(other.month)
        val dayOfMonthCompare = this.dayOfMonth.compareTo(other.dayOfMonth)

        return if(yearCompare!=0) yearCompare else if(monthCompare!=0) monthCompare else if(dayOfMonthCompare!=0) dayOfMonthCompare else 0;
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2