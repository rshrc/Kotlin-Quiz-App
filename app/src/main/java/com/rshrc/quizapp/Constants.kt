package com.rshrc.quizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium",
            "India",
            "Bhutan",
            "Brazil",
            1
        )
        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Belgium",
            "Argentina",
            "Bhutan",
            "Germany",
            2
        )
        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_france,
            "China",
            "Britain",
            "France",
            "Italy",
            3
        )
        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Belgium",
            "India",
            "Bhutan",
            "Brazil",
            2
        )
        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_italy,
            "USA",
            "China",
            "Italy",
            "Australia",
            1
        )

        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)

        return questionList
    }
}