<?php

// TODO: clean up this mess

function getTypeNames($numberOfTypes){
    $declarations = [];
    for($i = 1; $i <= $numberOfTypes; $i++){
        $declarations[] = "T$i";
    }
    return $declarations;
}

function getNamesWithoutR($numberOfTypes){
    return implode(', ', getTypeNames($numberOfTypes));
}

function getAllTypes($numberOfTypes){
    $allTypes = array_merge(getTypeNames($numberOfTypes), array('R'));
    return implode(', ', $allTypes);
}

function getTypeNamesWithValues($numberOfTypes){
    $declarations = [];
    for($i = 1; $i <= $numberOfTypes; $i++){
        $declarations[] = "T$i v$i";
    }
    return implode(', ', $declarations);
}

function getTypeNamesWithValuesScala($numberOfTypes){
    $declarations = [];
    for($i = 1; $i <= $numberOfTypes; $i++){
        $declarations[] = "v$i: T$i";
    }
    return implode(', ', $declarations);
}

function getNamesOnly($numberOfTypes){
    $declarations = [];
    for($i = 1; $i <= $numberOfTypes; $i++){
        $declarations[] = "v$i";
    }
    return implode(', ', $declarations);
}


// Generate Function0...Function22
function generateFunctions(){

    for($i = 0; $i <= 22; $i++){
        $filename = "src\\main\\java\\com\\github\\eirslett\\sc8\\Function$i.java";

        $content = "package com.github.eirslett.sc8;\r\n\r\n";

        // $types = getTypes($i);
        $allTypes = getAllTypes($i);
        $typesWithNames = getTypeNamesWithValues($i);

        $content .= "public interface Function$i<$allTypes> {\r\n";
        $content .= "    R apply($typesWithNames);\r\n";
        $content .= "}";

        file_put_contents($filename, $content);
    }
}

// Generate Consumer0...Function22
function generateConsumers(){

    for($i = 0; $i <= 22; $i++){
        $filename = "src\\main\\java\\com\\github\\eirslett\\sc8\\Consumer$i.java";

        $content = "package com.github.eirslett.sc8;\r\n\r\n";

        // $types = getTypes($i);
        $namesWithoutR = getNamesWithoutR($i);
        $typesWithNames = getTypeNamesWithValues($i);

        $typeParameter = $i > 0? "<$namesWithoutR>":"";

        $content .= "public interface Consumer{$i}{$typeParameter} {\r\n";
        $content .= "    void apply($typesWithNames);\r\n";
        $content .= "}";

        file_put_contents($filename, $content);
    }
}

// Generate Sc8
function generateSc8(){
    $filename = "src\\main\\scala\\com\\github\\eirslett\\sc8\\Sc8.scala";
    $content = "package com.github.eirslett.sc8\r\n\r\n";
    $content .= "import com.github.eirslett.sc8.{\r\n";
    $imports = [];
    for($i = 0; $i <= 22; $i++){
        $imports[] = "  Function$i => JavaFunction$i";
    }
//    for($i = 0; $i <= 22; $i++){
//        $imports[] = "  Consumer$i";
//    }
    $content .= implode(",\r\n", $imports);
    $content .= "\r\n}\r\n\r\nobject Sc8 {\r\n";

    // Functions
    for($i = 0; $i <= 22; $i++){
        $allTypes = getAllTypes($i);
        $typesWithNamesScala = getTypeNamesWithValuesScala($i);
        $namesOnly = getNamesOnly($i);
        $content .= "  def F[$allTypes](f: JavaFunction{$i}[$allTypes]) = ($typesWithNamesScala) => f($namesOnly)\r\n";
    }

    // The special case
    $content .= "  def C(c: Consumer0) = () => c()\r\n";

    // Consumers
    for($i = 1; $i <= 22; $i++){
        $namesWithoutR = getNamesWithoutR($i);
        $allTypes = getAllTypes($i);
        $typesWithNamesScala = getTypeNamesWithValuesScala($i);
        $namesOnly = getNamesOnly($i);
        $content .= "  def C[$namesWithoutR](c: Consumer{$i}[$namesWithoutR]) = ($typesWithNamesScala) => c($namesOnly)\r\n";
    }

    $content .= "}";

    file_put_contents($filename, $content);
}

generateFunctions();
generateConsumers();
generateSc8();