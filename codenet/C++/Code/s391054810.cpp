#include <iostream>

int main()
{
  int h, w, hh, ww;
  std::cin >> h >> w >> hh >> ww;
  std::cout << (h-hh) * (w-ww) << '\n';
  return 0;
}
