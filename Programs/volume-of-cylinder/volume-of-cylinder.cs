using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VolumeCylinder
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Insert the radius: ");
            double radius = Convert.ToDouble(Console.ReadLine());

            Console.Write("Insert the height: ");
            double height = Convert.ToDouble(Console.ReadLine());

            double volume = Math.PI * radius * radius * height;

            Console.WriteLine($"\nThe volume is: {volume} m3");

            Console.ReadLine();
        }
    }
}
