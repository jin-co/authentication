using System;

namespace PhoneBook
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] input = new string[] { "119", "97674223", "1195524421" };            
            Console.WriteLine(PhoneBook.Phone(input));
        }
    }
}
