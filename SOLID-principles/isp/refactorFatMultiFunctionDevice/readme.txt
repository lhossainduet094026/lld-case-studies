Refactor MultiFunctionDevice

Problem: You have a MultiFunctionDevice interface with print(), scan(), fax(), and staple() methods.
 A BasicPrinter only prints. Refactor into separate Printable, Scannable, and Faxable interfaces 
 so that BasicPrinter only implements the capabilities it actually supports.

Requirements:

Create four focused interfaces: Printable, Scannable, Faxable, and Stapleable
BasicPrinter implements only Printable
OfficePrinter implements Printable, Scannable, and Faxable
FullDevice implements all four interfaces
No class should have empty methods or throw UnsupportedOperationException

// Before: Fat interface forces BasicPrinter to implement everything
interface MultiFunctionDevice {
    void print(String document);
    void scan(String document);
    void fax(String document, String number);
    void staple(String document);
}

class BasicPrinter implements MultiFunctionDevice {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        throw new UnsupportedOperationException("BasicPrinter cannot scan.");
    }

    @Override
    public void fax(String document, String number) {
        throw new UnsupportedOperationException("BasicPrinter cannot fax.");
    }

    @Override
    public void staple(String document) {
        throw new UnsupportedOperationException("BasicPrinter cannot staple.");
    }
}

public class Main {
    public static void main(String[] args) {
        BasicPrinter printer = new BasicPrinter();
        printer.print("report.pdf");
    }
}

// TODO: Create Printable, Scannable, Faxable, and Stapleable interfaces.
// TODO: Refactor BasicPrinter to implement only Printable.
// TODO: Create an OfficePrinter that implements Printable, Scannable, and Faxable.
// TODO: Create a FullDevice that implements all four interfaces.