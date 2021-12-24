using System;

namespace PhoneBook
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] input = new string[] { "123", "456", "789" };            
            Console.WriteLine(PhoneBook.Phone(input));
        }
    }
}
