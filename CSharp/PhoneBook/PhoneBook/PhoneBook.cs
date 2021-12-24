using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PhoneBook
{
    class PhoneBook
    {
        public static bool Phone(String[] input)
        {
            bool answer = true;

            string[] values = input.ToString().Split(',');
            foreach (var i in values)
            {
                Console.WriteLine(i);
            }
            



            return answer;
        }
    }
}
