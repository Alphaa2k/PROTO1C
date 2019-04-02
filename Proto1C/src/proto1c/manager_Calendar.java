package proto1c;
import java.time.*;
import java.util.*;
import java.text.SimpleDateFormat;
/**
 *
 * @author UP820734
 */
public class manager_Calendar {
    private static Calendar currentCalendar = Calendar.getInstance();
    private static Calendar modCalendar = Calendar.getInstance();
    private int guiMonth;
    private int guiYear;
    private int currentDay;
    private int currentMonth;
    private int currentYear;
    private SimpleDateFormat dayFormat = new SimpleDateFormat("u",Locale.getDefault());
    
    /**
     * Creates and controls all calendars and dates
     */
    public manager_Calendar() {
    currentDay = currentCalendar.get(Calendar.DATE);
    currentMonth = currentCalendar.get(Calendar.MONTH) +1;
    currentYear = currentCalendar.get(Calendar.YEAR);
    guiMonth = currentMonth;
    guiYear = currentYear;
    }
    
    /**
     * 
     * @param month
     * @return 
     */
    public int getNumDays(int month) {
        YearMonth yearMonth = YearMonth.of(currentYear, month);
        return yearMonth.lengthOfMonth();
    }
    
    /**
     * Gets the first day of given month and year e.g. 1st of March 2019 is a Friday so returns 5
     * @param month the specified month
     * @param year the specified year
     * @return day of the week in int form e.g.1 = Monday
     */
    public int getFirstDay (int month, int year) {
        modCalendar.set(year, month -1, 1);
        return Integer.valueOf(dayFormat.format(modCalendar.getTime()));
    }
    
    /**
     * Takes an int and converts it into month name
     * @param month the specified month
     * @return String containing month name
     */
    public String getMonth(int month) {
        return Month.of(month).name();
    }
    
    /**
     * Returns value of currentDay variable
     * @return int of currentDay
     */
    public int getCurrentDay() {
        return currentDay;
    }
    
    /**
     * Returns value of currentMonth variable
     * @return int of currentMonth
     */
    public int getCurrentMonth() {
        return currentMonth;
    }
    
    /**
    * Returns value of currentYear variable
     * @return int of currentYear
     */
    public int getCurrentYear() {
        return currentYear;
    }
    
    /**
     * Returns value of guiMonth variable
     * @return int of guiMonth
     */
    public int getGuiMonth() {
        return guiMonth;
    }
    
    /**
     * 
     * @return 
     */
    public LocalDate getCurrentDate() {
        return LocalDate.of(currentYear,currentMonth,currentDay);
    }
    
    /**
     * Sets the guiMonth variable and changes guiYear variable if applicable
     * @param guiMonth the new specified month
     */
    public void setGuiMonth(int guiMonth) {
        this.guiMonth = guiMonth;
        if (this.guiMonth > 12) {
            setGuiYear(getGuiYear() + 1);
            this.guiMonth = 1;
        }
        else if (this.guiMonth < 1) {
            setGuiYear(getGuiYear() - 1);
            this.guiMonth = 12;
        }
    }
    
    /**
     * Returns value of guiYear variable
     * @return int of guiYear
     */
    public int getGuiYear() {
        return guiYear;
    }
    
    /**
     * Sets the guiYear variable
     * @param guiYear the new specified year
     */
    public void setGuiYear(int guiYear) {
        this.guiYear = guiYear;
    }
    
    
    
    
    
}
