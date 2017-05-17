package com.example.soportecea.posicionamientodeinteriores;

/**
 * Created by Ismael Ochoa on 03/05/2017.
 */

public class Arbol {

    private double norm;

    public void Arbol() {
    }

    public String comparar(double x, double y, double z) {
        norm = Math.sqrt((Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)));
       /* x=(x-321.394)/9937.153;
        y=(y-172.055)/5971.462;
        z=(z-(-.2))/13.108;
        norm=(norm-30184.04)/1490076.733;*/

        if (y <= 48.3978) {
            if (z <= 5.6564) {
                if (x <= 49.1928) {
                    if (y <= 33.3601) {
                        return "C";
                    }// if 4
                    if (y > 33.3601) {
                        return "E";
                    }// if 4
                }// if 3
                if (x > 49.1928) {
                    if (z <= 2.6611) {
                        if (x <= 67.0639) {
                            if (x <= 62.8173) {
                                if (z <= 1.8295) {
                                    if (norm <= 62.15358) {
                                        return "D";
                                    }//if 8
                                    if (norm > 62.15358) {
                                        if (norm <= 73.78022) {
                                            if (x <= 57.3318) {
                                                if (z <= 0.4989) {
                                                    if (x <= 56.6238) {
                                                        return "E";
                                                    }// if 12
                                                    if (x > 56.6238) {
                                                        if (z <= -2.3284) {
                                                            if (z <= -5.4901) {
                                                                return "A";
                                                            }//if 14
                                                            if (z > -5.4901) {
                                                                return "D";
                                                            }// if 14
                                                        }//if 13
                                                        if (z > -2.3284) {
                                                            if (norm <= 64.931274) {
                                                                return "E";
                                                            }//if 14
                                                            if (norm > 64.931274) {
                                                                return "C";
                                                            }//if14
                                                        }//if 13
                                                    }// if 12
                                                }// if 11
                                                if (z > 0.4989) {
                                                   return "D";
                                                }//if 11
                                            } // if10
                                            if (x > 57.3318) {
                                                if (z <= -0.3326) {
                                                    if (z <= -5.8227) {
                                                        if (y <= 39.2364) {
                                                            return "E";
                                                        }// if 13
                                                        if (y > 39.2364) {
                                                            return "D";
                                                        }// if 13
                                                    }//if 12
                                                    if (z > -5.8227) {
                                                        return "D";
                                                    }// 12
                                                }//if 11
                                                if (z > -0.3326) {
                                                    return "E";
                                                }//if 11
                                            }// if 10
                                        }// if9
                                        if (norm > 73.78022) {
                                            return "D";
                                        }//if9
                                    }//if 8
                                }//if 7
                                if (z > 1.8295) {
                                    if (x <= 57.8628) {
                                        if (x <= 52.2003) {
                                            return "E";
                                        }// if9
                                        if (x > 52.2003) {
                                            if (y <= 40.6188) {
                                                return "D";
                                            }//if10
                                            if (y > 40.6188) {
                                                return "C";
                                            }//if10
                                        }//if9
                                    }//if 8
                                    if (x > 57.8628) {
                                        if (norm <= 71.429344) {
                                            if (z <= 2.4948) {
                                                if (norm <= 69.66306) {
                                                    if (z <= 2.1621) {
                                                        if (x <= 59.1018) {
                                                            return "E";
                                                        }//if13
                                                        if (x > 59.1018) {
                                                            return "D";
                                                        }//if13
                                                    }//if 12
                                                    if (z > 2.1621) {
                                                        return "E";
                                                    }//if 12
                                                }//if11
                                                if (norm > 69.66306) {
                                                    return "E";
                                                }
                                            }//if10
                                            if (z > 2.4948) {
                                                return "D";
                                            }//if10
                                        }//if9
                                        if (norm > 71.429344) {
                                            return "D";
                                        }//if9

                                    }//if 8
                                }//if 7
                            } // if 6
                            if (x > 62.8173) {
                                return "D";
                            }//if6
                        }// if 5
                        if (x > 67.0639) {
                            return "C";
                        }//if5
                    }//if 4
                    if (z > 2.6611) {
                        if (norm <= 68.97502) {
                            if (z <= 3.6605) {
                                if (x <= 59.1018) {
                                    if (x <= 55.0323) {
                                        return "C";
                                    }//if8
                                    if (x > 55.0323) {
                                        return "D";
                                    }//if8
                                }//if 7
                                if (x > 59.1018) {
                                    return "C";
                                }
                            }//if6
                            if (z > 3.6605) {
                                return "C";
                            }//if6
                        }//if5
                        if (norm > 68.97502) {
                            if (norm <= 80.6211) {
                                if (y <= 30.9401) {
                                    if (z <= 4.4921) {
                                        if (norm <= 70.19303) {
                                            if (x <= 63.3483) {
                                                return "C";
                                            }//if10
                                            if (x > 63.3483) {
                                                return "D";
                                            }//if10
                                        }//if9
                                        if (norm > 70.19303) {
                                            return "E";
                                        }//if9
                                    }//if8
                                    if (z > 4.4921) {
                                        if (z <= 4.8248) {
                                            return "D";
                                        }//if9
                                        if (z > 4.8248) {
                                            if (y <= 29.7302) {
                                                if (y <= 28.1738) {
                                                    if (y <= 25.2349) {
                                                        return "D";
                                                    }//if12
                                                    if (y > 25.2349) {
                                                        return "C";
                                                    }//if12
                                                }//if11
                                                if (y > 28.1738) {
                                                    if (norm <= 71.2174) {
                                                        return "C";
                                                    }//if12
                                                    if (norm > 71.2174) {
                                                        return "E";
                                                    }//if12
                                                }//if11
                                            }//10
                                            if (y > 29.7302) {
                                                return "D";
                                            }//10
                                        }//if9
                                    }//if8
                                }//if7
                                if (y > 30.9401) {
                                    return "D";
                                }//if7
                            }//if6
                            if (norm > 80.6211) {
                                return "C";
                            }
                        }//if5
                    }//if4
                }// if 3
            }// if 2
            if (z > 5.6564) {
                if (z <= 9.3185) {
                    if (norm <= 68.89087) {
                        if (x <= 62.1093) {
                            return "C";
                        }
                        if (x > 62.1093) {
                            return "D";
                        }
                    }
                    if (norm > 68.89087) {
                        if (z <= 6.4895) {
                            if (norm <= 70.70305) {
                                if (z <= 5.9906) {
                                    return "C";
                                }//if7
                                if (z > 5.9906) {
                                    if (z <= 6.1574) {
                                        if (norm <= 70.00978) {
                                            return "D";
                                        }//if9
                                        if (norm > 70.00978) {
                                            return "C";
                                        }//if9
                                    }//if8
                                    if (z > 6.1574) {
                                        if (x <= 58.5708) {
                                            return "D";
                                        }
                                        if (x > 58.5708) {
                                            if (y <= 30.2474) {
                                                return "D";
                                            }
                                            if (y > 30.2474) {
                                                return "C";
                                            }
                                        }
                                    }//if8
                                }//if7
                            }//if6
                            if (norm > 70.70305) {
                                if (x <= 65.2954) {
                                    return "D";
                                }
                                if (x > 65.2954) {
                                    if (y <= 29.039) {
                                        return "C";
                                    }
                                    if (y > 29.039) {
                                        if (norm <= 74.92317) {
                                            return "D";
                                        }
                                        if (norm > 74.92317) {
                                            if (z <= 6.1574) {
                                                return "C";
                                            }
                                            if (z > 6.1574) {
                                                return "D";
                                            }
                                        }
                                    }
                                }
                            }
                        }//if5
                        if (z > 6.4895) {
                            if (x <= 63.1713) {
                                return "C";
                            }
                            if (x > 63.1713) {
                                if (norm <= 78.94109) {
                                    if (y <= 34.5687) {
                                        if (z <= 7.155) {
                                            return "D";
                                        }
                                        if (z > 7.155) {
                                            if (x <= 65.2954) {
                                                if (y <= 30.2474) {
                                                    return "D";
                                                }
                                                if (y > 30.2474) {
                                                    return "C";
                                                }
                                            }
                                            if (x > 65.2954) {
                                                return "D";
                                            }
                                        }
                                    }
                                    if (y > 34.5687) {
                                        if (z <= 7.9864) {
                                            if (z <= 7.3211) {
                                                return "C";
                                            }
                                            if (z > 7.3211) {
                                                return "D";
                                            }
                                        }
                                        if (z > 7.9864) {
                                            return "C";
                                        }
                                    }
                                }
                                if (norm > 78.94109) {
                                    return "C";
                                }
                            }
                        }
                    }//if4
                }//if3
                if (z > 9.3185) {
                    return "C";
                }
            }//if2
        }// if 1
        if (y > 48.3978) {
            if (x <= 16.4566) {
                if (x <= 9.555) {
                    return "B";
                }
                if (x > 9.555) {
                    if (y <= 60.8428) {
                        return "E";
                    }
                    if (y > 60.8428) {
                        return "B";
                    }
                }
            }
            if (x > 16.4566) {
                if (z <= -3.4942) {
                    if (y <= 66.0278) {
                        if (x <= 22.8256) {
                            if (y <= 56.694) {
                                return "E";
                            }
                            if (y > 56.694) {
                                return "B";
                            }
                        }
                        if (x > 22.8256) {
                            if (z <= -8.319) {
                                if (x <= 42.6452) {
                                    return "E";
                                }
                                if (x > 42.6452) {
                                    if (y <= 50.4714) {
                                        return "C";
                                    }
                                    if (y > 50.4714) {
                                        return "E";
                                    }
                                }
                            }
                            if (z > -8.319) {
                                if (norm <= 65.504524) {
                                    return "E";
                                }
                                if (norm > 65.504524) {
                                    return "A";
                                }
                            }
                        }
                    }
                    if (y > 66.0278) {
                        if (x <= 30.2581) {
                            return "B";
                        }
                        if (x > 30.2581) {
                            if (z <= -17.3049) {
                                return "E";
                            }
                            if (z > -17.3049) {
                                return "A";
                            }
                        }
                    }
                }
                if (z > -3.4942) {
                    return "A";
                }
            }
        }

        return "X";
    }
}