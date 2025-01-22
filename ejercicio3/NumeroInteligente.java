package objetos.ejercicio3;
public class NumeroInteligente {
    private int valor;

    public NumeroInteligente() {
        this.valor = 1;
    }

    public NumeroInteligente(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void incrementar() {
        ++this.valor;
    }

    public void decrementar() {
        --this.valor;
    }

    public void incrementar(int n) {
        this.valor += n;
    }

    public void decrementar(int n) {
        this.valor -= n;
    }

    public boolean esPrimo() {
        if (this.valor < 2) {
            return false;
        } else {
            for(int i = 2; (double)i <= Math.sqrt((double)this.valor); ++i) {
                if (this.valor % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public boolean esPerfecto() {
        int sumaDivisores = 0;

        for(int i = 1; i < this.valor; ++i) {
            if (this.valor % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == this.valor;
    }
}
