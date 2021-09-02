package com.paligot.kighlighter.core

data class SnippetRange(
    val range: IntRange,
    val color: Color
)

fun List<SnippetRange>.fillEmptyRanges(endRange: Int, color: Color): List<SnippetRange> {
    if (this.isEmpty()) return emptyList()
    val list = arrayListOf<SnippetRange>()
    forEachIndexed { index, it ->
        if (index == 0 && it.range.first != 0) {
            list.add(SnippetRange(IntRange(0, it.range.first - 1), color))
            list.add(it)
        } else if (index != 0) {
            val last = list.lastOrNull()
            if (last == null) {
                list.add(SnippetRange(IntRange(0, it.range.first - 1), color))
                list.add(it)
            } else if (it.range.first > last.range.last) {
                list.add(SnippetRange(IntRange(last.range.last + 1, it.range.first - 1), color))
                list.add(it)
            }
        }
    }
    list.add(SnippetRange(IntRange(list.last().range.last + 1, endRange - 1), color))
    return list
}
