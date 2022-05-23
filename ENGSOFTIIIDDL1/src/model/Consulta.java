package model;

import java.sql.Time;

public class Consulta {

	private Paciente paciente;
	private Medico medico;
	private int dia;
	private Time horario;
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public Time getHorario() {
		return horario;
	}

	public void setHorario(Time horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Consulta [paciente: " + paciente + ", medico: " + medico 
				+ ", dia: " + dia + ", horario: " + horario + "]";
	}

}