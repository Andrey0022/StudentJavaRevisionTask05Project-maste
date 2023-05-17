package by.itstep.javatraining.revision.task;

/*	Task 04. Amount of days [количество дней]
 *
 *	Даны порядковый номер месяца и номер года.
 *	Определите количество дней в заданном месяце соответствующего года.
 *
 *	Примечание
 *	1) Постарайтесь реализовать основной алгоритм так, чтобы в нём было не более двух условных конструкций.
 *	2) Не забудьте про "защиту от дурака": если номер месяца некорректен, то нужно возвратить 0.
 *
 *	Формат входных данных [input]
 *	На вход даётся два целых числа в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено количество дней в заданном месяце или ноль (при неверных данных месяца).
 *
 *	[ input 1]: 4 2023
 *	[output 1]: 30
 *
 *	[ input 2]: 5 2023
 *	[output 2]: 31
 *
 *	[ input 3]: 2 1900
 *	[output 3]: 28
 *
 *	[ input 4]: 2 2000
 *	[output 4]: 29
 *
 *	[ input 5]: -7 2023
 *	[output 5]: 0
 *
 *	[ input 6]: 0 2023
 *	[output 6]: 0
 *
 *	[ input 7]: 13 2023
 *	[output 7]: 0
 */

public class Task04 {
    public static int task04(int month, int year) {
        int days = 0;

//        if (month > 0 && month < 13) {
//            if (month == 2) {
//                days = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 29 : 28;
//            } else {
//                days = month < 8 && month % 2 != 0 || month > 7 && month % 2 == 0 ? 31 : 30;
//            }
//        }
//        return days;

        if (month < 1 || month > 12) {
            return 0;
        } else if (month == 2) {
            days = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 29 : 28;
        } else {
            days = month == 4 || month == 6 || month == 9 || month == 11 ? 30 : 31;
        }
        return days;
    }
}