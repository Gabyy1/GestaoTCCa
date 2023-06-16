package boundary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BindexAluno extends JFrame {

	private JPanel contentPane;
	private JTextField alnRA;
	private JTextField alnCURSO;
	private JTextField alnNOME;
	private JTextField alnCPF;
	private JTextField alnEMAIL;
	private JTextField alnTEL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BindexAluno frame = new BindexAluno();
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
	public BindexAluno() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel alnPainelTop = new JPanel();
		
		JLabel lblNewLabel_1 = new JLabel("RA:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1_1 = new JLabel("CURSO:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1_2 = new JLabel("NOME: ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1_3 = new JLabel("CPF:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1_2_1 = new JLabel("EMAIL:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1_2_2 = new JLabel("CONTATO:");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		alnRA = new JTextField();
		alnRA.setColumns(10);
		
		alnCURSO = new JTextField();
		alnCURSO.setColumns(10);
		
		alnNOME = new JTextField();
		alnNOME.setColumns(10);
		
		alnCPF = new JTextField();
		alnCPF.setColumns(10);
		
		alnEMAIL = new JTextField();
		alnEMAIL.setColumns(10);
		
		alnTEL = new JTextField();
		alnTEL.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(alnPainelTop, GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED, 320, GroupLayout.PREFERRED_SIZE))
								.addComponent(alnRA, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 288, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 240, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 299, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 240, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1_2_2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 240, GroupLayout.PREFERRED_SIZE))
								.addComponent(alnCURSO, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
								.addComponent(alnNOME, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
								.addComponent(alnCPF, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
								.addComponent(alnEMAIL, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
								.addComponent(alnTEL, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnAdicionar, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAtualizar, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
							.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addGap(24))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(alnPainelTop, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(alnRA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(alnCURSO, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(alnNOME, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(alnCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(alnEMAIL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addComponent(lblNewLabel_1_2_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(alnTEL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAdicionar, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAtualizar, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		JLabel lblNewLabel = new JLabel("Tela ALUNO(s)");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		alnPainelTop.add(lblNewLabel);
		contentPane.setLayout(gl_contentPane);
	}
}