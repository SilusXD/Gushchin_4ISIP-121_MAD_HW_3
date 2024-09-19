import java.util.ArrayList;

public class Matrix
{
    /*private ArrayList<ArrayList<Double>> mass = new ArrayList<ArrayList<Double>>();

    Matrix(ArrayList<ArrayList<Double>> matrix)
    {
        this.mass = matrix;
    }

    public Matrix sum(Matrix matrix)
    {
        if(this.getM() == matrix.getM() && this.getN() == matrix.getN())
        {
            ArrayList<ArrayList<Double>> newMatrix = new ArrayList<ArrayList<Double>>();
            for (int i = 0; i < this.getM(); i++)
            {
                ArrayList<Double> row = new ArrayList<>();
                for (int j = 0; j < getN(); j++)
                {
                    row.add(this.mass.get(i).get(j) + matrix.getEl(i,j));
                }
                newMatrix.add(row);
            }
            return new Matrix(newMatrix);
        }
        return new Matrix(new ArrayList<>());
    }

    public Matrix mult(Matrix matrix)
    {
        if(this.getM() == matrix.getN())
        {
            ArrayList<ArrayList<Double>> newMatrix = new ArrayList<ArrayList<Double>>();
            for (int i = 0; i < this.getM(); i++)
            {
                ArrayList<Double> row = new ArrayList<Double>();
                for (int j = 0; j < matrix.getN(); j++)
                {
                    row.add(mass.get(i).get(j) * matrix.getEl(j, i));
                }
                newMatrix.add(row);
            }
        }

        return new Matrix(new ArrayList<>());
    }

    void print()
    {
        for (ArrayList<Double> row : mass)
        {
            for (Double el : row)
            {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    double getEl(int i, int j)
    {
        return this.mass.get(i).get(j);
    }

    int getM()
    {
        return this.mass.size();
    }

    int getN()
    {
        for (ArrayList<Double> row : mass)
        {
            return row.size();
        }
        return -1;
    }*/

    private double[][] mass;

    Matrix(double[][] mass)
    {
        this.mass = mass;
    }

    public Matrix sum(Matrix matrix)
    {
        int M = getM();
        int N = getN();

        double[][] newMass = new double[M][N];

        if(M == matrix.getM() && N == matrix.getN())
        {
            for (int i = 0; i < M; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    newMass[i][j] = mass[i][j] + matrix.getEl(i,j);
                }
            }
        }

        return new Matrix(newMass);
    }

    public Matrix sum(double num)
    {
        int M = getM();
        int N = getN();

        double[][] newMass = new double[M][N];

        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                newMass[i][j] = mass[i][j] + num;
            }
        }

        return new Matrix(newMass);
    }

    public Matrix mult(Matrix matrix)
    {
        int M = getM();
        int N = getN();

        double[][] newMass = new double[M][N];

        if(M == matrix.getN())
        {
            for (int i = 0; i < M; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    for (int k = 0; k < N; k++)
                    {
                        newMass[i][j] += mass[i][k] * matrix.getEl(k, j);
                    }
                }
            }
        }

        return new Matrix(newMass);
    }

    public Matrix mult(double num)
    {
        int M = getM();
        int N = getN();

        double[][] newMass = new double[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                newMass[i][j] = mass[i][j] * num;
            }
        }

        return new Matrix(newMass);
    }

    void print()
    {
        for (double[] row : mass)
        {
            for (double el : row)
            {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    double getEl(int i, int j)
    {
        return mass[i][j];
    }

    int getM()
    {
        return mass.length;
    }

    int getN()
    {
        return mass[0].length;
    }
}
