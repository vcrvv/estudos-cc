from time import sleep
print('O estouro de fogos logo se iniciara!')
comando = input('Iniciar contagem? ').upper()
if comando == 'SIM':
    for c in range(10, 0, -1):
        print('{}...'.format(c))
        sleep(1)
    print('FIiiiiii......')
    sleep(2)
    print('                                   .''.       ')
    print('       .''.      .        *''*    :_\/_:     . ')
    print("      :_\/_:   _\(/_  .:.*_\/_*   : /\ :  .' :.'.")
    print("  .''.: /\ :   ./)\   ':'* /\ * :  '..'.  -=:o:=-")
    print(" :_\/_:'.:::.    ' *''*    * '.\'/.' _\(/_'.':'.'")
    print(": /\ : :::::     *_\/_*     -= o =-  /)\    '  *'")
    print(" '..'  ':::'     * /\ *     .'/.\'.   '")
    print("     *            *..*         :")
else:
    print('ok... :( ')