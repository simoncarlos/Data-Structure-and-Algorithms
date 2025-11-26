package JavaConcepts.SOLID;

public class SRP {
    public static void main(String[] args) {
        Employee emp = new Employee("Carlos", 20.0, 160);
        EmployeeProcessor employeeProcessor = new EmployeeProcessor();
        employeeProcessor.createEmployeeProcessor(emp);
    }

    static public class EmployeeProcessor {
        public void createEmployeeProcessor(Employee employee) {
            EmployeePaymentProcessor employeePaymentProcessor = new EmployeePaymentProcessor(new SalaryCalculator(),
                    new EmailService(), new DatabaseService());
            employeePaymentProcessor.processPayment(employee);
        }
    }

    static public class EmployeePaymentProcessor {
        private calcualtePay calculatePay;
        private sendEmailService sendEmailService;
        private saveToDatabaseService saveToDatabaseService;

        public EmployeePaymentProcessor(calcualtePay calculatePay, sendEmailService sendEmailService,
                saveToDatabaseService saveToDatabaseService) {
            this.calculatePay = calculatePay;
            this.sendEmailService = sendEmailService;
            this.saveToDatabaseService = saveToDatabaseService;
        }

        public void processPayment(Employee employee) {
            double pay = calculatePay.calculatePay(employee);
            sendEmailService.sendEmail(employee);
            saveToDatabaseService.saveToDatabase(employee);
        }
    }

    static class Employee {
        private String name;
        private double hourlyRate;
        private int hoursWorked;

        public Employee(String name, double hourlyRate, int hoursWorked) {
            this.name = name;
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        public String getName() {
            return name;
        }

        public double getHourlyRate() {
            return hourlyRate;
        }

        public int getHoursWorked() {
            return hoursWorked;
        }
    }

    interface calcualtePay {
        public double calculatePay(Employee employee);
    }

    interface sendEmailService {
        public void sendEmail(Employee employee);
    }

    interface saveToDatabaseService {
        public void saveToDatabase(Employee employee);
    }

    static public class SalaryCalculator implements calcualtePay {
        public double calculatePay(Employee employee) {
            double pay = employee.getHourlyRate() * employee.getHoursWorked();
            System.out.println("Calculando salario para " + employee.getName() + ": $" + pay);
            return pay;
        }
    }

    static public class EmailService implements sendEmailService {
        public void sendEmail(Employee employee) {
            System.out.println("EMAIL: Conectando a servidor SMTP...");
            System.out.println("EMAIL: Enviando confirmación de pago a " + employee.getName());
            System.out.println("EMAIL: Enviado.");
        }
    }

    static public class DatabaseService implements saveToDatabaseService {
        public void saveToDatabase(Employee employee) {
            System.out.println("DB: Conectando a PostgreSQL...");
            System.out.println("DB: Guardando empleado " + employee.getName() + "...");
            System.out.println("DB: Guardado exitoso.");
        }
    }

}
