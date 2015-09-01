class Student {
  double gradeInMaths;
  double gradeInScience;
  double gradeInEnglish;
  double gradeInSocial;
  double gradeInFirstLang;
  String dateOfBirth;
  String hallTicketNo;
  double avgGrade;

  Student(double gradeInMaths, double gradeInScience, double gradeInEnglish,
    double gradeInSocial, double gradeInFirstLang,String dateOfBirth,
    String hallTicketNo) {
    this.gradeInMaths = gradeInMaths;
    this.gradeInScience = gradeInScience;
    this.gradeInEnglish = gradeInEnglish;
    this.gradeInSocial = gradeInSocial;
    this.gradeInFirstLang = gradeInFirstLang;
    this.dateOfBirth = dateOfBirth;
    this.hallTicketNo = hallTicketNo;
    this.avgGrade = (gradeInMaths + gradeInScience + gradeInEnglish +
            gradeInSocial + gradeInFirstLang)/5;
  }
  public double getAvgGrade() {
    return this.avgGrade;
  }

  public double getGradeInMaths() {
    return this.gradeInMaths;
  }

  public double getGradeInScience() {
    return this.gradeInScience;
  }

  public double getGradeInSocial() {
    return this.gradeInSocial;
  }

  public double getGradeInEnglish() {
    return  this.gradeInEnglish;
  }

  public double getGradeInFirstLang() {
    return this.gradeInFirstLang;
  }

  public String getDateOfBirth() {
    return this.dateOfBirth;
  }

  public String getHallTicketNo() {
    return  this.hallTicketNo;
  }

  public String toString() {
    String s = "Maths: " + gradeInMaths + "\t";
    s = s + "Science: " + gradeInScience + "\t";
    s = s + "English: " + gradeInEnglish + "\t";
    s = s + "Social: " + gradeInSocial + "\t";
    s = s + "FirstLang: " + gradeInFirstLang + "\t";
    s = s + "AvgGrade: " + avgGrade + "\t";
    s = s + "DateOfBirth: " + dateOfBirth + "\t";
    s = s + "HallTicketNo: " + hallTicketNo + ".";
    return s;
  }
}