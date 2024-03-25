package gui;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import entidades.Time;
import repositorios.TimeRepositorio;
import servicos.TimeServico;

public class InputTime {

	public static ArrayList<Time> timesBD = new ArrayList<Time>();
	public static TimeRepositorio timeRepositorio = new TimeRepositorio(timesBD);
	public static TimeServico timeServico = new TimeServico(timeRepositorio);

	public static void inputTime() {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Entre com o nome do time: ");
			String nome = scanner.nextLine();

			System.out.println("Entre com a data de nascimento do time (dd/MM/yyyy): ");
			Date dataNascimento = sdf.parse(scanner.nextLine());

			System.out.println("Entre com os pontos do time: ");
			int pontos = scanner.nextInt();

			Time novoTime = new Time(nome, dataNascimento, pontos);
			timeServico.cadastrar(novoTime);

		} catch (Exception e) {
			System.out.println("Erro ao criar o time: " + e.getMessage());
		} finally {
			scanner.close();
		}

	}

	public static void inputPontosTime() {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Entre com o codigo do time: ");
			long codigo = scanner.nextInt();

			System.out.println("Entre com os pontos do time: ");
			int pontos = scanner.nextInt();
			timeServico.addPontos(codigo, pontos);
			;

		} catch (Exception e) {
			System.out.println("Erro ao criar o time: " + e.getMessage());
		} finally {
			scanner.close();
		}

	}

	public static void imprimirTodosTimes() {
		for (Time time : timesBD) {
			System.out.println("NOME:" + time.getNome());
		}
	}

	public static void main(String[] args) {
		int opcao = -1;
		do {
			Scanner scanner = new Scanner(System.in);

			System.out.println("DIGITE:" + "\n 1 - Para Cadastrar Time" + "\n 2 - Para adicionar pontos ao Time"
					+ "\n 3 - Para Imprimir todos os Times" + "\n 0 - Para sair");
			opcao = scanner.nextInt();
			switch (opcao) {
			case 1:
				inputTime();
				break;
			case 2:
				inputPontosTime();
				break;
			case 3:
				imprimirTodosTimes();
				break;
			case 0:
				break;

			default:
				System.out.println("opcao invalida!");
			}

		} while (opcao != 0);

	}
}