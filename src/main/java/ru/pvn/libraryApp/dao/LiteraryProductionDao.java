package ru.pvn.libraryApp.dao;

import ru.pvn.libraryApp.models.LiteraryProduction;

public interface LiteraryProductionDao {
    LiteraryProduction getById(long id);
    void create(LiteraryProduction literaryProduction);
}
