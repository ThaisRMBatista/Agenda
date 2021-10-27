package com.thais.agenda;

import android.app.Application;

import com.thais.agenda.dao.AlunoDAO;
import com.thais.agenda.model.Aluno;

public class AgendaApplicaiton extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Alex", "123456", "alex@gmail.com"));
        dao.salva(new Aluno("Bruna", "654321", "bruna@gmail.com"));
        dao.salva(new Aluno("Thaís", "789654", "thais@gmail.com"));
    }
}
