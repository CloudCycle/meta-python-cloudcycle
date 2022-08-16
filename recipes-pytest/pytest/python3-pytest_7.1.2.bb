
SUMMARY = "pytest: simple powerful testing with Python"
HOMEPAGE = "https://docs.pytest.org/en/latest/"
AUTHOR = "Holger Krekel, Bruno Oliveira, Ronny Pfannschmidt, Floris Bruynooghe, Brianna Laugher, Florian Bruhin and others <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd27e41b6550fe0fc45356d1d81ee37c"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/4e/1f/34657c6ac56f3c58df650ba41f8ffb2620281ead8e11bcdc7db63cf72a78/pytest-7.1.2.tar.gz"
SRC_URI[md5sum] = "4a98001581a18d4084cb5027fdb1467d"
SRC_URI[sha256sum] = "a06a0425453864a270bc45e71f783330a7428defb4230fb5e6a731fde06ecd45"

S = "${WORKDIR}/pytest-7.1.2"

DEPENDS += " "
RDEPENDS_${PN} = "python3-attrs python3-iniconfig python3-packaging python3-pluggy python3-py python3-tomli"

BBCLASSEXTEND = "native nativesdk"
