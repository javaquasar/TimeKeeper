﻿package time_obj;


/**
 * Стиль отображения счетчика времени целиком.
 * 
 * @version 1.0
 * @author Igor Taranenko
 */
public enum Time_display_style
{
	/** Отображаются <u>только</u> те единицы времени, которые "имеют вес"
	 * (т.е.&nbsp;значение которых достигнуто). Так если текущим значением в
	 * режиме секундомера является 10&nbsp;минут 0&nbsp;секунд&nbsp;&#0151;
	 * отображаться будут только минуты и секунды. Аналогично для других
	 * режимов подсчета времени. */
	TDS_if_reaches,
	/** Отображаются все единицы времени, даже если значение времени
	 * является меньше. */
	TDS_show_all,
	/** Выбирается <u>строгий</u> диапазон отображаемых единиц времени. Другие
	 * единицы времени не&nbsp;будут отображаться даже в случае выхода значения
	 * времени за указанный диапазон единиц. */
	TDS_custom_strict,
	/** Выбирается <u>нестрогий</u> диапазон отображаемых единиц времени.
	 * Единицы большего значения, не&nbsp;входящие в диапазон, будут
	 * отображаться только в случае выхода значения времени за указанный
	 * диапазон единиц. Является стилем отображения счетчика времени
	 * по&nbsp;умолчанию. */
	TDS_increase_able
}