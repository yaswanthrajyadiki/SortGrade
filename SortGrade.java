import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;
import java.util.TreeSet;

class SortGrade {
  List<Student> stuList;
  SortGrade(List<Student> stuList) {
    this.stuList = stuList;
  }

  public int compareDouble(double val1, double val2) {
    if (val1 > val2) return 1;
    if (val1 < val2) return -1;
    return 0;
  }

  public int compareStrings(String str1, String str2) {
    if (str1.compareTo(str2) > 0) return 1;
    if (str1.compareTo(str2) < 0) return -1;
    return 0;
  }

  public List<Student> sortingGrade() {
    for (int i = 0; i < stuList.size(); i++) {
      for (int j = 0; j < stuList.size(); j++) {
        if (this.compareDouble(stuList.get(i).getAvgGrade(),
          stuList.get(j).getAvgGrade()) == 1) {
          Collections.swap(stuList, i, j);
        } else if (this.compareDouble(stuList.get(i).getAvgGrade(),
          stuList.get(j).getAvgGrade()) == 0) {
            if (this .compareDouble(stuList.get(i).getGradeInMaths(),
              stuList.get(j).getGradeInMaths()) == 1 ) {
              Collections.swap(stuList,i,j);
            } else if (this .compareDouble(stuList.get(i).getGradeInMaths(),
              stuList.get(j).getGradeInMaths()) == 0) {
                if (this .compareDouble(stuList.get(i).getGradeInScience(),
                   stuList.get(j).getGradeInScience()) == 1) {
                  Collections.swap(stuList,i,j);
                } else if (this .compareDouble(stuList.get(i).getGradeInScience(),
                    stuList.get(j).getGradeInScience()) == 0) {
                    if (this .compareDouble(stuList.get(i).getGradeInSocial(),
                      stuList.get(j).getGradeInSocial()) == 1) {
                      Collections.swap(stuList,i,j);
                    } else if (this .compareDouble(stuList.get(i).getGradeInSocial(),
                        stuList.get(j).getGradeInSocial()) == 0) {
                        if (this .compareDouble(stuList.get(i).getGradeInFirstLang(),
                          stuList.get(j).getGradeInFirstLang()) == 1) {
                          Collections.swap(stuList,i,j);
                        } else if(this .compareDouble(stuList.get(i).getGradeInFirstLang(),
                            stuList.get(j).getGradeInFirstLang()) == 0){
                            if (this .compareStrings(stuList.get(i).getDateOfBirth(),
                            stuList.get(j).getDateOfBirth()) == -1) {
                              Collections.swap(stuList,i,j);
                            } else if (this .compareStrings(stuList.get(i).getDateOfBirth(),
                              stuList.get(j).getDateOfBirth()) == 0) {
                                if (this .compareStrings(stuList.get(i).getHallTicketNo(),
                                  stuList.get(j).getHallTicketNo()) == -1) {
                                  Collections.swap(stuList,i,j);
                                }
                              }
                          }
                      }
                  }
              }
          } 
      }
    }
    return stuList;
  }
   
}
