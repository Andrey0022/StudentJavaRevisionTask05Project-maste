package by.itstep.javatraining.revision.task;

/*	Task 09. Intersection of Segments [пересечение отрезков]
 *
 *  На числовой прямой даны два отрезка: [a1; b1] и [a2; b2].
 *  Найдите их пересечение с использованием эффективного и простого алгоритма.
 *
 *  Примечание
 *  Пересечением двух отрезков может быть:
 *  1) отрезок [a, b];
 *  2) точка (point - number);
 *  3) пустое множество (empty set).
 *
 *	Формат входных данных [input]
 *	На вход даются четыре целые числа a1, b1, a2, b2, которые задают соответствующие отрезки.
 *  Концы соответствующих отрезков могут задаваться неупорядоченно.
 *
 *  Формат выходных данных [output]
 *	Должна быть возвращена строка, которая может содержать следующее:
 *  1) границу отрезка в формате "segment - [a, b]", являющегося пересечением;
 *  2) общую точку в формате "point - number", где number - число;
 *  3) "empty set" - «пустое множество», если у отрезков нет пересечения;
 *  4) "error", если данные заданы некорректно.
 *
 *	[ input 1]: 1 3 2 4
 *	[output 1]: segment - [2, 3]
 *
 *	[ input 5]: 3 1 2 4
 *	[output 5]: segment - [2, 3]
 *
 *	[ input 2]: 1 2 2 3
 *	[output 2]: point - 2
 *
 *	[ input 3]: 1 2 3 4
 *	[output 3]: empty set
 *
 *	[ input 4]: 2 2 3 4
 *	[output 4]: error
 */

public class Task09 {
    public static String task09(int a1, int b1, int a2, int b2) {

        String msg = "";

        if (a1 == b1 || a2 == b2) {
            return "error";
        }
        if (a1 > b1) {
            int t = b1;
            b1 = a1;
            a1 = t;
        }
        if (a2 > b2) {
            int t = b2;
            b2 = a2;
            a2 = t;
        }
        if (a1 == b2) {
            msg = String.format("point - " + "%d", a1);
        } else if (b1 == a2) {
            msg = String.format("point - " + "%d", b1);

        } else if (b1 < a2 || b2 < a1) {
            msg = "empty set";

        } else {
            int s1 = a1 <= a2 ? a2 : a1;
            int s2 = b2 <= b1 ? b2 : b1;
            msg = String.format("segment - " + "[%d, " + "%d]", s1, s2);
        }
        return msg;
    }
}