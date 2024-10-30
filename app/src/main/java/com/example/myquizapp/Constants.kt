package com.example.myquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )

        val que2 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Bolivia",
            "Australia",
            "Japan",
            "United States",
            2
        )

        val que3 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Germany",
            "Australia",
            "Armenia",
            "Balgium",
            4
        )

        val que4 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "South Africa",
            "Romenia",
            "Brazil",
            "Poland",
            3
        )

        val que5 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Switzerland",
            "Denmark",
            "Monaco",
            "Italy",
            2
        )

        val que6 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji",
            "Paraguai",
            "China",
            "England",
            1
        )

        val que7 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Cuba",
            "Russia",
            "Balgium",
            "Germany",
            4
        )

        val que8 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Thailand",
            "India",
            "Romenia",
            "Taiwan",
            2
        )

        val que9 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Egypt",
            "Singapore",
            "France",
            "Kuwait",
            4
        )

        val que10 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand",
            "Austria",
            "Portugal",
            "England",
            1
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)

        return questionsList
    }
}