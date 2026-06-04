public int moreHistoryThanMathAbsences()
{
    int count = 0;

    // For each student in historyList, check if they also appear in mathList
    for (CourseRecord histRec : historyList) {
        String id = histRec.getStudentID();

        // search for matching ID in mathList
        for (CourseRecord mathRec : mathList) {
            if (mathRec.getStudentID().equals(id)) {
                // student is in both courses
                if (histRec.getAbsences() > mathRec.getAbsences()) {
                    count++;
                }
            }
        }
    }

    return count;
}
