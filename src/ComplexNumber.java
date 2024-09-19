public class ComplexNumber
{
    private double a;
    private double bi;

    ComplexNumber(double a, double bi)
    {
        this.a = a;
        this.bi = bi;
    }

    ComplexNumber sum(ComplexNumber complexNumber)
    {
        double a = this.a + complexNumber.a;
        double bi = this.bi + complexNumber.bi;

        return new ComplexNumber(a, bi);
    }

    ComplexNumber sub(ComplexNumber complexNumber)
    {
        double a = this.a - complexNumber.a;
        double bi = this.bi - complexNumber.bi;

        return new ComplexNumber(a, bi);
    }

    ComplexNumber mult(ComplexNumber complexNumber)
    {
        double a = this.a * complexNumber.a - this.bi * complexNumber.bi;
        double bi = this.a * complexNumber.bi + this.bi * complexNumber.a;

        return new ComplexNumber(a, bi);
    }

    ComplexNumber div(ComplexNumber complexNumber)
    {
        double a = (this.a * complexNumber.a + this.bi * complexNumber.bi)
                /(Math.pow(complexNumber.a, 2) + Math.pow(complexNumber.bi, 2));

        double bi = (this.bi * complexNumber.a - this.a * complexNumber.bi)
                /(Math.pow(complexNumber.a,2) + Math.pow(complexNumber.bi,2));

        return new ComplexNumber(a, bi);
    }

    void print()
    {
        System.out.printf("z = %f + %fi\n", a, bi);
    }

    public double getA()
    {
        return a;
    }

    public double getBi()
    {
        return bi;
    }
}
