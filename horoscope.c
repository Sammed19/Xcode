#include<windows.h>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
main()
{
    FILE *GEMINI,*SCORPIO,*LIBRA,*ARI,*TAURUS,*CANCER,*LEO,*VIRGO,*SAG,*CAP,*AQ,*P;
    char *name; //POINTER NAME
    char a[100000],b[100000],c[100000],d[100000],e[100000],f[100000],g[100000],h[100000],i[100000],j[100000],k[100000],l[100000];
    int day,month,year;
    system("COLOR AC");
    printf("\n\t\tWelcome to Yearly Horoscope!\n");
    Sleep(3000); // GIVES A DELAY OF 3000 MILLISECONDS THAT IS 3 SECONDS
    printf("\n\n\tCHECK YOUR HOROSCOPE BY FILLING THE DETAILS!\n");
    Sleep(3000);
    printf("\nEnter your good name:");
    name=(char*)malloc(0*sizeof(char)); //DYNAMIC MEMORY ALLOCATION FOR VARIABLE "name"
    gets(name);
    printf("\nEnter your birth month:");
    scanf("%d",&month);
    if(month == 0)
    {
        printf("Invalid date");
        return 9;
        exit(9);

    }
    else
    {
    printf("\nEnter your birth day:");
    scanf("%d",&day);
    printf("\nEnter your birth year:");
    scanf("%d",&year);
    if(month == 3 && day >= 21 || month == 4 && day <= 19)
    {
        printf("\n\t HEY %s, YOUR ZODIAC SIGN IS ARIES\n  Wait for the horoscope....\n",name);
        Sleep(3000);
        ARI=fopen("D:\\New folder\\ARIES.txt","r");
            while(!feof(ARI))
            {
                fgets(a,100,ARI);
                puts(a);
            }
            fclose(ARI);
    }
        else if(month == 4 && day >= 20 || month == 5 && day<=20)
        {
            printf("\n\t HEY %s, YOUR ZODIAC SIGN IS TAURUS\n  Wait for the horoscope....\n",name);
            Sleep(3000);
            TAURUS=fopen("D:\\New folder\\TAURUS.txt","r");
                while(!feof(TAURUS))
                {
                    fgets(b,100,TAURUS);
                    puts(b);
                }
                fclose(TAURUS);
        }
            else if(month == 5 && day >= 21 || month == 6 && day<=20)
            {
                printf("\n\t HEY %s, YOUR ZODIAC SIGN IS GEMINI\n  Wait for the horoscope....\n",name);
                Sleep(3000);
                GEMINI=fopen("D:\\New folder\\GEMINI.txt","r");
                    while(!feof(GEMINI))
                    {
                        fgets(c,100,GEMINI);
                        puts(c);
                    }
                    fclose(GEMINI);
            }
                else if(month == 6 && day >= 21 || month == 7 && day<=22)
                {
                    printf("\n\t HEY %s, YOUR ZODIAC SIGN IS CANCER\n  Wait for the horoscope....\n",name);
                    Sleep(3000);
                    CANCER=fopen("D:\\New folder\\CANCER.txt","r");
                        while(!feof(CANCER))
                        {
                            fgets(d,100,CANCER);
                            puts(d);
                        }
                        fclose(CANCER);
                }
                    else if(month == 7 && day >= 23 || month == 8 && day <= 22)
                    {
                        printf("\n\t HEY %s, YOUR ZODIAC SIGN IS LEO\n  Wait for the horoscope....\n",name);
                        Sleep(3000);
                        LEO=fopen("D:\\New folder\\LEO.txt","r");
                            while(!feof(LEO))
                            {
                                fgets(e,100,LEO);
                                puts(e);
                            }
                            fclose(LEO);
                    }
                        else if(month == 8 && day >= 23 || month == 9 && day <= 22)
                        {
                            printf("\n\t HEY %s, YOUR ZODIAC SIGN IS VIRGO\n  Wait for the horoscope....\n",name);
                            Sleep(3000);
                            VIRGO=fopen("D:\\New folder\\VIRGO.txt","r");
                            while(!feof(VIRGO))
                            {
                                fgets(f,100,VIRGO);
                                puts(f);
                            }
                           fclose(VIRGO);
                        }
                            else if(month == 9 && day >= 23 || month == 10 && day <= 22)
                            {
                                printf("\n\t HEY %s, YOUR ZODIAC SIGN IS LIBRA\n  Wait for the horoscope....\n",name);
                                Sleep(3000);
                                LIBRA=fopen("D:\\New folder\\LIBRA.txt","r");
                                while(!feof(LIBRA))
                                {
                                    fgets(g,100,LIBRA);
                                    puts(g);
                                }
                                fclose(LIBRA);
                            }
                            else if(month == 10 && day >= 23 || month == 11 && day <= 21)
                            {
                                printf("\n\t HEY %s, YOUR ZODIAC SIGN IS SCORPIO\n  Wait for the horoscope....\n",name);
                                Sleep(3000);
                                SCORPIO=fopen("D:\\New folder\\SCORPIO.txt","r");
                                    while(!feof(SCORPIO))
                                    {
                                        fgets(h,100,SCORPIO);
                                        puts(h);
                                    }
                                    fclose(SCORPIO);
                            }
                                else if(month == 11 && day >= 22 || month == 12 && day <= 21)
                                {
                                    printf("\n\t HEY %s, YOUR ZODIAC SIGN IS SAGITTARIUS\n  Wait for the horoscope....\n",name);
                                    Sleep(3000);
                                    SAG=fopen("D:\\New folder\\SAG.txt","r");
                                        while(!feof(SAG))
                                        {
                                            fgets(i,100,SAG);
                                            puts(i);
                                        }
                                        fclose(SAG);
                                }
                                    else if(month == 12 && day >= 22 || month == 1 && day <= 19)
                                    {
                                        printf("\n\t HEY %s, YOUR ZODIAC SIGN IS CAPRICORN\n  Wait for the horoscope....\n",name);
                                        Sleep(3000);
                                        CAP=fopen("D:\\New folder\\CAP.txt","r");
                                            while(!feof(CAP))
                                            {
                                                fgets(j,100,CAP);
                                                puts(j);
                                            }
                                            fclose(CAP);
                                    }
                                        else if(month == 1 && day >= 20 || month == 2 && day <= 18)
                                        {
                                            printf("\n\t HEY %s, YOUR ZODIAC SIGN IS AQUARIUS\n  Wait for the horoscope....\n",name);
                                            Sleep(3000);
                                            ARI=fopen("D:\\New folder\\ARIES.txt","r");
                                                while(!feof(ARI))
                                                {
                                                    fgets(k,100,ARI);
                                                    puts(k);
                                                }
                                                fclose(ARI);
                                        }
                                            else if(month == 2 && day >= 19 || month == 3 && day <= 20)
                                            {
                                                printf("\n\t HEY %s, YOUR ZODIAC SIGN IS PISCES\n  Wait for the horoscope....\n",name);
                                                Sleep(3000);
                                                P=fopen("D:\\New folder\\P.txt","r");
                                                while(!feof(P))
                                                {
                                                    fgets(l,100,P);
                                                    puts(l);
                                                }
                                                fclose(P);
                                            }
                                                free(name);   //TO CLEAR DYNAMIC MEMORY ALLOCATED
                                                    }
                                                        }