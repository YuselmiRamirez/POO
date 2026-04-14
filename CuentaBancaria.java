public class CuentaBancaria {
    private int saldo = 100;
    private synchronized void depositar(int monto) {
        int saldoActual =this.saldo;
        saldoActual = saldoActual + monto;
        this.saldo = saldoActual;
    }
    public synchronized int getSaldo() {
        return this.saldo;
    }
}