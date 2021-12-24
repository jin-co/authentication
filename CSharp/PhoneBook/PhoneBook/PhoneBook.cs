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

            List<string> values = new List<string>() { };

            for (int i = 0; i < input.Length; i++)
            {
                values.Add(input[i]);
            }
            
            foreach (var i in values)
            {
                for (int j = 0; j < values.Count; j++)
                {
                    if (i != values[j] && values[j].StartsWith(i))
                    {
                        answer = false;
                    }
                }
            }

            return answer;
        }
    }
}
