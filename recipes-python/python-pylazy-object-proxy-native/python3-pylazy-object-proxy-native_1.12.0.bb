SUMMARY = "A fast and thorough lazy object proxy for Python"
HOMEPAGE = "https://python-lazy-object-proxy.readthedocs.io/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f0cd92fd68aacee0503822c05a3ee6a2"

DEPENDS += "python3-setuptools-scm-native"

PYPI_PACKAGE = "lazy_object_proxy"

SRC_URI[md5sum] = "386c1a466619c1dd674d4245c51d38a1"
SRC_URI[sha256sum] = "1f5a462d92fd0cfb82f1fab28b51bfb209fabbe6aabf7f0d51472c0c124c0c61"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
