// SKIP_TXT

// TESTCASE NUMBER: 1
fun case_1(value_1: Int): String {
    while (true) {
        when {
            value_1 == 1 -> break
        }
    }

    return ""
}

// TESTCASE NUMBER: 2
fun case_2(value_1: Int): String {
    while (true) {
        when {
            value_1 == 1 -> continue
        }
    }

    return ""
}
