package io;

import java.util.List;
import entity.Aluno;

public interface IJson {

	public void open() throws Exception;

	public void write(List<Aluno> alunos) throws Exception;

	public void close() throws Exception;

}
