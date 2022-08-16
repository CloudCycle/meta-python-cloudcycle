
SUMMARY = "Fast read/write of AVRO files"
HOMEPAGE = "https://github.com/fastavro/fastavro"
AUTHOR = "Miki Tebeka <miki.tebeka@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42dc034c86697f9a03ede4438424b4c5"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/66/ad/eaf93f82ccba90eee2325513ca54f5ab9700a5642c32a6bf0a50afdde243/fastavro-1.3.0.tar.gz"
SRC_URI[md5sum] = "eae0ebb2568f045739a714f39f9f8857"
SRC_URI[sha256sum] = "f401be0ca4b1b17bda3ed69faaf967829ec8586cb6da6482b1f3bc9246a6fea6"

S = "${WORKDIR}/fastavro-1.3.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
