
SUMMARY = "A common runtime for AWS Python projects"
HOMEPAGE = "https://github.com/awslabs/aws-crt-python"
AUTHOR = "Amazon Web Services, Inc <aws-sdk-common-runtime@amazon.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/51/1f/4d9193f7b16d102c3c11d8edcb11ea741ac6562d8fcf4d1ae1aa223f197c/awscrt-0.14.0.tar.gz"
SRC_URI[md5sum] = "083858a20862184c58be5461c476e8b2"
SRC_URI[sha256sum] = "3062d315cb16542fe04dd8239f2e8bc3238ee9045cd5070b915cf2ebbecbaaac"

S = "${WORKDIR}/awscrt-0.14.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
