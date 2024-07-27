package week4;
public class Date {
  int day;
  int month;
  int year;
  public Date(){
    day=0;
    month=0;
    year=0;
  }
  public Date(int d,int m,int y){
    day=d;
    month=m;
    year=y;
  }
  public int getYears(Date d)
  {
    return 2024 - d.year;
  }
  public String toString(){
    return "DOJ:" +day+"."+month+"."+year;
  }
}
