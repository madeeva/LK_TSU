package com.example.lktsu

import android.app.Application
import com.example.lktsu.data.Id
import com.example.lktsu.data.model.MarksEntity
import com.example.lktsu.data.model.NewsEntity
import com.example.lktsu.data.model.StatementEntity
import com.example.lktsu.data.model.StudentEntity
import com.example.lktsu.di.DataStoreScope
import com.example.lktsu.repositories.RoomRepositoryImpl
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@HiltAndroidApp
class LKApp : Application() {

    @Inject
    lateinit var roomRepositoryImpl: RoomRepositoryImpl

    override fun onCreate() {
        super.onCreate()

        //Добавляем в цикле все нужные нам данные
        for (student in students) {
            DataStoreScope.launch(Dispatchers.IO) {
                roomRepositoryImpl.insertStudent(student)
            }
        }

        for (news in newsList) {
            DataStoreScope.launch(Dispatchers.IO) {
                roomRepositoryImpl.insertNews(news)
            }
        }

        for (statement in statementList) {
            DataStoreScope.launch(Dispatchers.IO) {
                roomRepositoryImpl.insertStatement(statement)
            }
        }

        for (mark in marksList) {
            DataStoreScope.launch(Dispatchers.IO) {
                roomRepositoryImpl.insertMark(mark)
            }
        }
    }

    companion object Data {
        val students = listOf(
            StudentEntity(
                id = Id.long,
                name = "Мадеева Валерия Александровна",
                group = "221071",
                phone1 = "89586639724",
                phone2 = "89651589140",
                phone3 = "",
                email = "madeeva.va@gmail.com"
            )
        )

        val newsList = listOf(
            NewsEntity(
                id = 1,
                title = "Внимание! Кафедра подготовила материалы для проведения испытания по дисциплине Электронные вычислительные машины и периферийные устройства",
                description = "Кафедра подготовила материалы для проведения испытания по дисциплине Электронные вычислительные машины и периферийные устройства. Начало испытания 22.12.2020 00:00:00. Окончание испытания 22.12.2020 23:00:00"
            ),
            NewsEntity(
                id = 2,
                title = "О технических работах в ЛК 12.11.2020 с 17-00 до 18-00",
                description = "12.11.2020 г. с 17-00 до 18-00 будут проводится технические работы на оборудовании, в связи с этим будут наблюдаться перебои в работе системы."
            ),
            NewsEntity(
                id = 3,
                title = "О технических работах в ЛК 11.11.2020 с 17-00 до 18-00",
                description = "11.11.2020 г. с 17-00 до 18-00 будут проводится технические работы на оборудовании, в связи с этим будут наблюдаться перебои в работе системы."
            ),
            NewsEntity(
                id = 4,
                title = "Занятия по физической культуре будут проходить дистанционно с 5.11 до 23.12.",
                description = "Занятия по физической культуре будут проходить дистанционно с 5.11 до 23.12."
            ),
            NewsEntity(
                id = 5,
                title = "О режиме работы кассы",
                description = "Внимание. До 15.10.2020 прием платежей в кассу ТулГУ (гл.корп.) осуществляется в следующем режиме: пн-чт 8.30-16.00, пт - 8.30-15.00, обед 12.12-13.00"
            ),
        )

        val statementList = listOf(
            StatementEntity(
                id = 1,
                title = "Повышенная академическая стипендия студента/Повышенная академическая стипендия 3 уровня (выпускники)",
                description = "21.08.2020 16:06 - Новое Добавление/размножение события. Ответственный - Лисицын С.А." + "\n\n" +
                        "21.08.2020 16:06 - Новое Добавление примечания к событию. Ответственный - Лисицын С.А.. Примечание: бюджет" + "\n\n" +
                        "03.09.2020 00:04 - К исполнению. Изменение статуса события. Ответственный - Лисицын С.А.",
                student_id = Id.long,
                number = 1,
                status = ""
            ),
            StatementEntity(
                id = 2,
                title = "Повышенная академическая стипендия студента/Повышенная академическая стипендия 3 уровня",
                description = "25.01.2021 22:38 - Новое Добавление/размножение события. Ответственный - Лисицын С.А." + "\n\n" +
                        "25.01.2021 22:38 - Новое Добавление примечания к событию. Ответственный - Лисицын С.А.. Примечание: бюджет" + "\n\n" +
                        "27.01.2021 09:29 - Аннулировано. Изменение статуса события. Ответственный - Лисицын С.А.",
                student_id = Id.long,
                number = 2,
                status = ""
            ),
            StatementEntity(
                id = 3,
                title = "Заявление на един.мат помощь в связи с необходимостью дорогостоящего лечения и (или) восстановления здоровья",
                description = "01.06.2021 10:07 - Новое Добавление примечания к событию. Ответственный - Лисицын С.А.. Примечание: бюджет" + "\n\n" +
                        "01.06.2021 10:07 - Новое Добавление/размножение события. Ответственный - Лисицын С.А." + "\n\n" +
                        "07.06.2021 15:07 - К исполнению. Изменение статуса события. Ответственный - Лисицын С.А.",
                student_id = Id.long,
                number = 3,
                status = ""
            )
        )

        val marksList = listOf(
            MarksEntity(
                id = 1,
                student_id = Id.long,
                subject = "Всеобщая история",
                mark = "Зачет",
                semester = 1,
                event = "зч"
            ),
            MarksEntity(
                id = 2,
                student_id = Id.long,
                subject = "Иностранный язык",
                mark = "Зачет",
                semester = 1,
                event = "зч"
            ),
            MarksEntity(
                id = 3,
                student_id = Id.long,
                subject = "Информатика",
                mark = "5",
                semester = 1,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 4,
                student_id = Id.long,
                subject = "История России",
                mark = "5",
                semester = 1,
                event = "Э"
            ),
            MarksEntity(
                id = 5,
                student_id = Id.long,
                subject = "Математика",
                mark = "4",
                semester = 1,
                event = "Э"
            ),
            MarksEntity(
                id = 6,
                student_id = Id.long,
                subject = "Правоведение и противодействии коррупции",
                mark = "Зачет",
                semester = 1,
                event = "зч"
            ),
            MarksEntity(
                id = 7,
                student_id = Id.long,
                subject = "Управление проектной деятельностью и бизнес-планирование",
                mark = "5",
                semester = 1,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 8,
                student_id = Id.long,
                subject = "Физическая культура и спорт",
                mark = "Зачет",
                semester = 1,
                event = "зч"
            ),
            MarksEntity(
                id = 10,
                student_id = Id.long,
                subject = "Философия",
                mark = "4",
                semester = 2,
                event = "Э"
            ),
            MarksEntity(
                id = 11,
                student_id = Id.long,
                subject = "Базы данных",
                mark = "5",
                semester = 2,
                event = "КР"
            ),
            MarksEntity(
                id = 12,
                student_id = Id.long,
                subject = "Физическая культура и спорт (элективные модули)",
                mark = "Зачет",
                semester = 2,
                event = "зч"
            ),
            MarksEntity(
                id = 13,
                student_id = Id.long,
                subject = "Физика",
                mark = "5",
                semester = 2,
                event = "Э"
            ),
            MarksEntity(
                id = 14,
                student_id = Id.long,
                subject = "Психология лидерства и командной работы",
                mark = "Зачет",
                semester = 2,
                event = "зч"
            ),
            MarksEntity(
                id = 15,
                student_id = Id.long,
                subject = "Программирование",
                mark = "4",
                semester = 2,
                event = "Э"
            ),
            MarksEntity(
                id = 16,
                student_id = Id.long,
                subject = "Операционные системы и среды",
                mark = "Зачет",
                semester = 2,
                event = "зч"
            ),
            MarksEntity(
                id = 17,
                student_id = Id.long,
                subject = "Ознакомительная практика",
                mark = "5",
                semester = 2,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 18,
                student_id = Id.long,
                subject = "Математика",
                mark = "Зачет",
                semester = 2,
                event = "зч"
            ),
            MarksEntity(
                id = 19,
                student_id = Id.long,
                subject = "Иностранный язык",
                mark = "4",
                semester = 2,
                event = "зч"
            ),
            MarksEntity(
                id = 20,
                student_id = Id.long,
                subject = "Физическая культура и спорт (элективные модули)",
                mark = "Зачет",
                semester = 3,
                event = "зч"
            ),
            MarksEntity(
                id = 21,
                student_id = Id.long,
                subject = "Физика",
                mark = "5",
                semester = 3,
                event = "Э"
            ),
            MarksEntity(
                id = 22,
                student_id = Id.long,
                subject = "Социальные и политические институты и процессы в современном обществе",
                mark = "Зачет",
                semester = 3,
                event = "зч"
            ),
            MarksEntity(
                id = 23,
                student_id = Id.long,
                subject = "Программирование",
                mark = "Зачет",
                semester = 3,
                event = "зч"
            ),
            MarksEntity(
                id = 24,
                student_id = Id.long,
                subject = "Программирование",
                mark = "5",
                semester = 3,
                event = "КР"
            ),
            MarksEntity(
                id = 25,
                student_id = Id.long,
                subject = "Операционные системы и среды",
                mark = "5",
                semester = 3,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 26,
                student_id = Id.long,
                subject = "Математика",
                mark = "5",
                semester = 3,
                event = "Э"
            ),
            MarksEntity(
                id = 27,
                student_id = Id.long,
                subject = "Компьютерная графика",
                mark = "5",
                semester = 3,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 28,
                student_id = Id.long,
                subject = "Компьютерная графика",
                mark = "5",
                semester = 3,
                event = "КР"
            ),
            MarksEntity(
                id = 29,
                student_id = Id.long,
                subject = "Безопасность жизнедеятельности",
                mark = "Зачет",
                semester = 3,
                event = "зч"
            ),
            MarksEntity(
                id = 30,
                student_id = Id.long,
                subject = "Архитектура вычислительных систем",
                mark = "5",
                semester = 3,
                event = "Э"
            ),
            MarksEntity(
                id = 31,
                student_id = Id.long,
                subject = "Физическая культура и спорт (элективные модули)",
                mark = "Зачет",
                semester = 4,
                event = "зч"
            ),
            MarksEntity(
                id = 32,
                student_id = Id.long,
                subject = "Физика",
                mark = "5",
                semester = 4,
                event = "Э"
            ),
            MarksEntity(
                id = 33,
                student_id = Id.long,
                subject = "Технологическая (проектно-технологическая) практика",
                mark = "5",
                semester = 4,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 34,
                student_id = Id.long,
                subject = "Технологии программирования",
                mark = "5",
                semester = 4,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 35,
                student_id = Id.long,
                subject = "Теория вероятностей и математическая статистика",
                mark = "Зачет",
                semester = 4,
                event = "зч"
            ),
            MarksEntity(
                id = 36,
                student_id = Id.long,
                subject = "Метрология, стандартизация и сертификация",
                mark = "5",
                semester = 4,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 37,
                student_id = Id.long,
                subject = "Математика",
                mark = "5",
                semester = 4,
                event = "Э"
            ),
            MarksEntity(
                id = 38,
                student_id = Id.long,
                subject = "Компьютерные сети и телекоммуникации",
                mark = "5",
                semester = 4,
                event = "Э"
            ),
            MarksEntity(
                id = 39,
                student_id = Id.long,
                subject = "Исследование операций",
                mark = "Зачет",
                semester = 4,
                event = "зч"
            ),
            MarksEntity(
                id = 40,
                student_id = Id.long,
                subject = "Дискретная математика",
                mark = "5",
                semester = 4,
                event = "Э"
            ),
            MarksEntity(
                id = 41,
                student_id = Id.long,
                subject = "Экономика",
                mark = "Зачет",
                semester = 5,
                event = "зч"
            ),
            MarksEntity(
                id = 42,
                student_id = Id.long,
                subject = "Физическая культура и спорт (элективные модули)",
                mark = "Зачет",
                semester = 5,
                event = "зч"
            ),
            MarksEntity(
                id = 43,
                student_id = Id.long,
                subject = "Технологии программирования",
                mark = "5",
                semester = 5,
                event = "КР"
            ),
            MarksEntity(
                id = 44,
                student_id = Id.long,
                subject = "Технологии программирования",
                mark = "Зачет",
                semester = 5,
                event = "зч"
            ),
            MarksEntity(
                id = 45,
                student_id = Id.long,
                subject = "Теория систем и системный анализ",
                mark = "5",
                semester = 5,
                event = "Э"
            ),
            MarksEntity(
                id = 46,
                student_id = Id.long,
                subject = "Социально-экономическая статистика",
                mark = "Зачет",
                semester = 5,
                event = "зч"
            ),
            MarksEntity(
                id = 47,
                student_id = Id.long,
                subject = "Предметно-ориентированные информационные системы в менеджменте",
                mark = "5",
                semester = 5,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 48,
                student_id = Id.long,
                subject = "Информационный менеджмент",
                mark = "5",
                semester = 5,
                event = "Э"
            ),
            MarksEntity(
                id = 49,
                student_id = Id.long,
                subject = "Информационные системы и технологии",
                mark = "Зачет",
                semester = 5,
                event = "зч"
            ),
            MarksEntity(
                id = 50,
                student_id = Id.long,
                subject = "Деловая коммуникация",
                mark = "Зачет",
                semester = 5,
                event = "зч"
            ),
            MarksEntity(
                id = 51,
                student_id = Id.long,
                subject = "Введение в проектную деятельность",
                mark = "Зачет",
                semester = 5,
                event = "зч"
            ),
            MarksEntity(
                id = 52,
                student_id = Id.long,
                subject = "Валеология",
                mark = "Зачет",
                semester = 5,
                event = "зч"
            ),
            MarksEntity(
                id = 53,
                student_id = Id.long,
                subject = "Базы данных",
                mark = "Зачет",
                semester = 5,
                event = "зч"
            ),

            MarksEntity(
                id = 54,
                student_id = Id.long,
                subject = "Базы данных",
                mark = "5",
                semester = 6,
                event = "Э"
            ),
            MarksEntity(
                id = 55,
                student_id = Id.long,
                subject = "Математическое моделирование экономических систием",
                mark = "5",
                semester = 6,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 56,
                student_id = Id.long,
                subject = "Научно-исследовательская работа",
                mark = "5",
                semester = 6,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 57,
                student_id = Id.long,
                subject = "Основы информационной безопасности экономических систем",
                mark = "Зачет",
                semester = 6,
                event = "зч"
            ),
            MarksEntity(
                id = 58,
                student_id = Id.long,
                subject = "Предметно-ориентированные информационные системы в менеджменте",
                mark = "5",
                semester = 6,
                event = "Э"
            ),
            MarksEntity(
                id = 59,
                student_id = Id.long,
                subject = "Проектирование информационных систем",
                mark = "Зачет",
                semester = 6,
                event = "зч"
            ),
            MarksEntity(
                id = 60,
                student_id = Id.long,
                subject = "Социально-экономическая статистика",
                mark = "5",
                semester = 6,
                event = "Э"
            ),
            MarksEntity(
                id = 61,
                student_id = Id.long,
                subject = "Физическая культура и спорт (элективные модули)",
                mark = "Зачет",
                semester = 6,
                event = "зч"
            ),
            MarksEntity(
                id = 62,
                student_id = Id.long,
                subject = "Эконометрика",
                mark = "5",
                semester = 6,
                event = "Э"
            ),
            MarksEntity(
                id = 63,
                student_id = Id.long,
                subject = "Электронные вычислительные машины и периферийные устройства",
                mark = "5",
                semester = 7,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 64,
                student_id = Id.long,
                subject = "Технологии самореализации и саморазвития личности",
                mark = "5",
                semester = 7,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 65,
                student_id = Id.long,
                subject = "Сетевое программирование",
                mark = "Зачет",
                semester = 7,
                event = "зч"
            ),
            MarksEntity(
                id = 66,
                student_id = Id.long,
                subject = "Проектирование информационных систем",
                mark = "5",
                semester = 7,
                event = "Э"
            ),
            MarksEntity(
                id = 67,
                student_id = Id.long,
                subject = "Программная инженерия",
                mark = "Зачет",
                semester = 7,
                event = "зч"
            ),
            MarksEntity(
                id = 68,
                student_id = Id.long,
                subject = "Надежность, эргономика и качество информационных систем",
                mark = "5",
                semester = 7,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 69,
                student_id = Id.long,
                subject = "Методы и средства защиты компьютерной информации",
                mark = "5",
                semester = 7,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 70,
                student_id = Id.long,
                subject = "Математическое моделирование экономических систем",
                mark = "5",
                semester = 7,
                event = "Э"
            ),
            MarksEntity(
                id = 71,
                student_id = Id.long,
                subject = "Математичесое моделирование экономических систем",
                mark = "5",
                semester = 7,
                event = "КР"
            ),
            MarksEntity(
                id = 72,
                student_id = Id.long,
                subject = "Технико-экономический анализ деятельности предприятия",
                mark = "Зачет",
                semester = 8,
                event = "зч"
            ),
            MarksEntity(
                id = 73,
                student_id = Id.long,
                subject = "Сетевая экономика",
                mark = "5",
                semester = 8,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 74,
                student_id = Id.long,
                subject = "Проектирование информационных систем",
                mark = "5",
                semester = 8,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 75,
                student_id = Id.long,
                subject = "Проектирование информационных систем",
                mark = "5",
                semester = 8,
                event = "КП"
            ),
            MarksEntity(
                id = 76,
                student_id = Id.long,
                subject = "Преддипломная практика",
                mark = "5",
                semester = 8,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 77,
                student_id = Id.long,
                subject = "Компьютерная этика",
                mark = "5",
                semester = 8,
                event = "ДЗ"
            ),
            MarksEntity(
                id = 78,
                student_id = Id.long,
                subject = "Интеллектуальные информационные системы в экономике",
                mark = "5",
                semester = 8,
                event = "Э"
            ),
            MarksEntity(
                id = 79,
                student_id = Id.long,
                subject = "Выполнение и защита выпускной квалификационной работы",
                mark = "",
                semester = 8,
                event = "ВКР"
            ),
            )
    }
}