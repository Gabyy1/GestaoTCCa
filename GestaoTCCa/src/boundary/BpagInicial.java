package boundary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BpagInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BpagInicial frame = new BpagInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BpagInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Pagina Inicial");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton bt_ini_Aluno = new JButton("ALUNO");
		bt_ini_Aluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		bt_ini_Aluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BindexAluno aluno = new BindexAluno();
				aluno.setVisible(true);
			}
		});
		
		
		
		JButton bt_ini_Grupo = new JButton("GRUPO");
		bt_ini_Grupo.setFont(new Font("Tahoma", Font.BOLD, 12));
		bt_ini_Grupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BGrupo grupo = new BGrupo();
				grupo.setVisible(true);
			}
		});
		
		
		JButton bt_ini_Professor = new JButton("PROFESSOR");
		bt_ini_Professor.setFont(new Font("Tahoma", Font.BOLD, 12));
		bt_ini_Professor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BProfessor prof = new BProfessor();
				prof.setVisible(true);
			}
		});
		
		
		
		JButton bt_ini_Orientador = new JButton("ORIENTADOR");
		bt_ini_Orientador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BOrientador orientador = new BOrientador();
				orientador.setVisible(true);
			}
		});
		bt_ini_Orientador.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton bt_ini_Home = new JButton("HOME");
		bt_ini_Home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt_ini_Home.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton bt_ini_Sair = new JButton("SAIR");
		bt_ini_Sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		bt_ini_Sair.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(bt_ini_Home)
							.addGap(59)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(bt_ini_Aluno, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(bt_ini_Grupo, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(bt_ini_Professor, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(bt_ini_Orientador, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(bt_ini_Sair, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(bt_ini_Home, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(bt_ini_Aluno, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(bt_ini_Grupo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(bt_ini_Professor, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(bt_ini_Orientador, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
					.addComponent(bt_ini_Sair, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}