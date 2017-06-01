import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(o1: Int?, o2: Int?): Int {
            if (o1 == null) return -1
            if (o2 == null) return -1
            return o2.compareTo(o1)
        }
    })
    return arrayList
}