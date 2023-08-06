fun main() {
    val hashSet1 = hashSetOf<Any>('a', 'b', 'c', 'e', 1, 5, 4)
    val hashSet2 = hashSetOf<Any>('b', 'c', 2, 3, 6)

    sumHashSets(hashSet1, hashSet2).forEach { println(it) }

}

private fun sumHashSets(hashSet1: HashSet<Any>, hashSet2: HashSet<Any>): HashSet<Any> {
    // return hashSet1.union(hashSet2) as HashSet<Any>
    // return hashSet1.plus(hashSet2) as HashSet<Any>
    // return hashSet1.apply { addAll(hashSet2) }
    // return hashSet1.also { it.addAll(hashSet2) }

    /* val sumHashSet = HashSet<Any>()
        sumHashSet.addAll(hashSet1)
        sumHashSet.addAll(hashSet2)
        return sumHashSet*/

    return (hashSet1 + hashSet2) as HashSet<Any>

}