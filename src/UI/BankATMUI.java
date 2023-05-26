package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankATMUI {
    char uniChar = '\u20A6';
    JFrame Frame = new JFrame("Window");
    JButton Login = new JButton("Login");
    JLabel Password = new JLabel("Enter Password");
    JTextField PasswordField = new JTextField();

    public void mainUI() {
        Frame.setSize(450,500);
        Frame.setLayout(new GridLayout(3,1));
        Frame.setVisible(true);
        Frame.setLocationRelativeTo(null);
        Frame.setTitle("Welcome to Winner's bank");
        Frame.setBackground(Color.BLUE);
        Frame.add(Password);
        Frame.add(PasswordField);
        Frame.add(Login);

        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float userID = (Float.parseFloat(PasswordField.getText()));
                if (userID == 5555) {
                    accountTypeUI();
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect pin, Try again");
                }
            }
        });

    }

    JFrame Frame2 = new JFrame("Window");
    JButton accountTypeSavings = new JButton("Savings Account");
    JButton accountTypeCurrent = new JButton("Current Account");
    JTextField accountTypeField = new JTextField();

    public void accountTypeUI()

    {
        Frame.setSize(450, 500);
        Frame.setLayout(new GridLayout(2, 1));
        Frame.setVisible(true);
        Frame.setLocationRelativeTo(null);
        Frame.setTitle("Choose your account type");

        Frame.add(accountTypeSavings);
        Frame.add(accountTypeCurrent);
        Frame.add(accountTypeField);

        accountTypeSavings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                savingsUI();
            }
        });
        accountTypeCurrent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentUI();
            }
        });
    }
    JFrame FrameSavings = new JFrame("window");
    JLabel Balance = new JLabel("Balance: "+uniChar+"100000");
    JButton DepositSavings = new JButton("Deposit");
    JButton WithdrawSavings = new JButton("Withdraw");
    JTextField WithdrawSavingsField = new JTextField();

    public void savingsUI() {
        FrameSavings.setSize(450, 500);
        FrameSavings.setLayout(new GridLayout(3, 1));
        FrameSavings.setVisible(true);
        FrameSavings.setLocationRelativeTo(null);
        FrameSavings.setTitle("Account: Savings");

        FrameSavings.add(Balance);
        FrameSavings.add(DepositSavings);
        FrameSavings.add(WithdrawSavings);
        FrameSavings.add(WithdrawSavingsField);

        DepositSavings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositSavingsUI();
            }
        });
        WithdrawSavings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { withdrawCurrentUI();
            }
        });
    }

    JFrame FrameDepositSave = new JFrame("Window");
    JButton DepositSave = new JButton("Deposit");
    JLabel AmountDepositSave = new JLabel("Enter Deposit Amount");
    JTextField AmountFieldDepositSave = new JTextField();

    public void depositSavingsUI(){
        FrameDepositSave.setSize(450, 500);
        FrameDepositSave.setLayout(new GridLayout(2, 1));
        FrameDepositSave.setVisible(true);
        FrameDepositSave.setLocationRelativeTo(null);
        FrameDepositSave.setTitle("Deposit");

        FrameDepositSave.add(AmountDepositSave);
        FrameDepositSave.add(AmountFieldDepositSave);
        FrameDepositSave.add(DepositSave);

        DepositSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BankATM assObj = new BankATM();
                float answer = assObj.balance1(Float.parseFloat(AmountFieldDepositSave.getText()));
                JOptionPane.showMessageDialog(null, "You new balance " +uniChar+answer);
            }
        });
    }


