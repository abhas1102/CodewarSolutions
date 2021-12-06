//Two red beads are placed between every two blue beads. There are N blue beads. After looking at the arrangement below work out the number of red beads.

fun countRedBeads(nBlue: Int): Int = when {
    nBlue < 2 -> 0
    else -> (nBlue - 1) * 2
}