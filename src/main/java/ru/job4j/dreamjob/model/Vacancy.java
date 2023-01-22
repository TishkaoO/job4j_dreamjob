package ru.job4j.dreamjob.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
/*
модель описывает вакансию ru.jobj.dreamjob.model.Vacancy
 */
public class Vacancy {
    private int id;
    private String title;
    private String description;
    private LocalDateTime creationDate;

    public Vacancy(int id, String title, String description, LocalDateTime creationDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vacancy vacancy = (Vacancy) o;
        return id == vacancy.id && Objects.equals(title, vacancy.title)
                && Objects.equals(description, vacancy.description)
                && Objects.equals(creationDate, vacancy.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, creationDate);
    }
}